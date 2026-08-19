# Week 12 — Object Relationships: The HAS-A Relationship
## Cognitive Support Doc — A Second Set of Examples for Every Part
**Companion to:** Week12_ObjectRelationships_HAS-A.md | **Purpose:** If a student didn't click with the Car/House examples during class, use these instead. Same concepts, completely different real-world stories (a computer's internal parts and a restaurant kitchen), for reinforcement, review, or a struggling student in office hours.

---

## How to Use This Doc

This is NOT a second lesson — it is the SAME five concepts from today's class, retold with different stories. Use it when:
- A student says "I didn't really get the Car/Engine example"
- You want to check understanding by asking the student to explain the NEW story back to you
- A student missed class and needs a self-study version
- You want quick extra practice at the end of a session

---

## Part 1 — What Is HAS-A? Objects Made of Other Objects (alternate examples)

### Alternate Opening Story

> "Think about a computer. A computer HAS a CPU. A computer HAS RAM. A computer HAS a hard drive. You would never say 'a computer IS-A CPU' — that sentence makes no sense. The computer isn't a type of CPU; it CONTAINS a CPU as one of its real, physical parts. Pull the CPU out, and the computer stops being a working computer at all."

### Alternate Scenario Set — Restaurant

```
SCENARIO — RESTAURANT
─────────────────────────────────────────────────────────────────────
Whole:                Restaurant
Has-A:                 Kitchen, Menu, Table[]

Test:  "Restaurant IS-A Kitchen"?  NO — doesn't make sense
       "Restaurant HAS-A Kitchen"? YES — the restaurant genuinely
        contains a kitchen as one of its real parts
─────────────────────────────────────────────────────────────────────
```

### Comprehension Check

Ask the student: "Would it make sense to say 'a Restaurant IS-A Menu'? What's the correct relationship instead?"
*→ No — "Restaurant IS-A Menu" is absurd. The correct relationship is HAS-A: a Restaurant genuinely contains a Menu as one of its real parts.*

---

## Part 2 — Building Composition: An Object as a Field (alternate examples)

### Alternate Opening Story

> "When a computer manufacturer assembles a laptop, they don't build a CPU from raw silicon on the assembly line every time — they install an ALREADY-BUILT CPU chip into the laptop's motherboard slot. The laptop's design simply says: 'this laptop HAS a CPU slot, and here is which CPU goes in it.'"

### Walking Through the Computer Example

```
Computer (the whole)
  has a field:  CPU cpu

  When a Computer is built:
    the Computer's constructor creates (or receives) a CPU
    and stores it in the cpu field

  From now on:
    "this Computer's CPU" always refers to that SAME CPU
    object — a real, permanent part of this specific
    Computer, not a temporary value
```

### Comprehension Check

Ask the student: "If I create two separate Computer objects, do they share the SAME CPU object, or does each Computer have its own separate CPU?"
*→ Each Computer has its own separate CPU object — composition means each whole object genuinely owns its own copy of the part, not a shared one.*

---

## Part 3 — Delegation: Letting the Part Do the Work (alternate examples)

### Alternate Opening Story

> "When you click 'Run Program' on your computer, do YOU personally perform the calculations? No — the operating system asks the CPU to process the instructions, and the CPU does the actual work. The operating system doesn't need to know HOW the CPU performs calculations internally — it just calls 'process()' and trusts the CPU to handle the details."

### Delegation in Plain English — Restaurant Version

```
EXAMPLE — Restaurant.serveCustomer()
─────────────────────────────────────────────────────────────
Restaurant.serveCustomer() does NOT contain the actual
cooking logic.

Instead, Restaurant.serveCustomer() calls:
    kitchen.prepareMeal(order)

The Kitchen object — the PART — does the real work of
actually cooking. The Restaurant simply delegates the job
to the part that knows how to do it.
─────────────────────────────────────────────────────────────
```

### Comprehension Check

Ask the student: "If the Restaurant later hires a new head chef and completely changes how the Kitchen prepares meals, does the Restaurant's own `serveCustomer()` method need to change?"
*→ No — as long as Kitchen still has a working `prepareMeal()` method, Restaurant.serveCustomer() stays exactly the same; it delegates and trusts the part to handle its own internal details.*

---

## Part 4 — HAS-A vs IS-A: Choosing the Right Relationship (alternate examples)

### Alternate Comparison — Computer Parts vs Computer Types

```
IS-A (Inheritance)                       HAS-A (Composition)
────────────────────────────────────────────────────────────────────
Laptop IS-A Computer                      Laptop HAS-A Keyboard
  → Laptop is a MORE SPECIFIC kind          → Laptop CONTAINS a
    of Computer — same category,              Keyboard as one of its
    just more detailed                        parts — totally different
                                               kind of thing

Sentence test: "Laptop IS-A Computer"     Sentence test: "Laptop HAS-A
sounds correct and natural                Keyboard" sounds correct;
                                           "Laptop IS-A Keyboard" sounds
                                           absurd
────────────────────────────────────────────────────────────────────
```

### Comprehension Check

Ask the student to run the sentence test on `Table` and `Restaurant`: "Does 'Table IS-A Restaurant' sound right, or does 'Restaurant HAS-A Table' sound right?"
*→ "Restaurant HAS-A Table" is correct — a restaurant genuinely contains tables as parts of itself; a table is not a more specific kind of restaurant.*

---

## Part 5 — Java as Illustration (alternate examples)

### Reading Composition as a Concept — Computer Version

```java
// THE PART — a complete, independent class
public class CPU {
    private String model;

    public CPU(String model) {
        this.model = model;
    }

    public void process() {
        System.out.println("CPU (" + model + ") is processing instructions");
    }
}

public class RAM {
    private int gigabytes;

    public RAM(int gigabytes) {
        this.gigabytes = gigabytes;
    }

    public void loadData() {
        System.out.println("RAM (" + gigabytes + "GB) is loading data");
    }
}

// THE WHOLE — HAS-A CPU, HAS-A RAM
public class Computer {
    private String brand;
    private CPU cpu;    // HAS-A CPU — a field of another class
    private RAM ram;    // HAS-A RAM — a second field

    public Computer(String brand, String cpuModel, int ramSize) {
        this.brand = brand;
        this.cpu = new CPU(cpuModel);    // built when the Computer is built
        this.ram = new RAM(ramSize);
    }

    public void boot() {
        System.out.println(brand + " is booting up...");
        cpu.process();     // DELEGATION — Computer asks its CPU to do the work
        ram.loadData();     // DELEGATION — Computer asks its RAM to do the work
    }
}
```

### Using the Composed Object

```java
Computer myLaptop = new Computer("Dell", "Intel i7", 16);
myLaptop.boot();
```

```
OUTPUT:
─────────────────────────────────────────────────────────────
Dell is booting up...
CPU (Intel i7) is processing instructions
RAM (16GB) is loading data
─────────────────────────────────────────────────────────────
Computer did not personally know HOW to process instructions
or load data — it delegated both jobs to the CPU and RAM
objects it HAS.
```

### Comprehension Check

Ask the student to identify, line by line, which lines represent the HAS-A relationship (field declarations) and which lines represent delegation (method calls on those fields).

---

## Quick Self-Test (5 Questions)

Use these as a rapid oral or written check — same difficulty as the in-class Test Checkpoint, different wording.

1. In one sentence, why is "Computer HAS-A CPU" correct while "Computer IS-A CPU" is not?
2. In code, how does the HAS-A relationship usually appear inside a class definition?
3. True or False: delegation means the whole object performs the real work itself, just using a helper method name. Explain why.
4. A student says "Restaurant HAS-A Kitchen because a Restaurant needs a Kitchen to cook, just like a Kitchen needs a stove to cook." Is this reasoning correctly applying the HAS-A concept, or does it contain a common trap? Explain.
5. Why is composition often considered a safer design choice than forcing an awkward inheritance relationship?

**Answer Key:**
1. Because a Computer is not a more specific TYPE of CPU — a Computer genuinely contains a CPU as one of its real, physical parts; the sentence "Computer IS-A CPU" is absurd, while "Computer HAS-A CPU" is natural and correct.
2. As a field inside the class whose type is another class (e.g., `private CPU cpu;`), usually created inside the constructor.
3. False — delegation means the PART does the real work; the whole object's method typically just calls a method on the part and trusts it to handle the actual details.
4. It correctly applies HAS-A for "Restaurant HAS-A Kitchen" — that part is fine. But be careful: this reasoning style is exactly how the IS-A trap sneaks in elsewhere (e.g., "Student HAS-A Person" from Part 1's misconception) — always double-check each relationship individually with the sentence test rather than assuming a pattern applies everywhere.
5. Because swapping out a contained part (like a new CPU model) doesn't require changing the containing object's own code, as long as the new part still provides the same working actions — whereas forcing an awkward "IS-A" where composition belongs leads to confusing, broken designs.

---

*Week 12 Cognitive Support Doc | Object-Oriented Programming Concepts | @KhmerSide | syuthd.com*
