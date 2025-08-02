# Copilot Instructions for DSARevision/Arrays

## Project Overview
This codebase contains a collection of small, focused programs for Data Structures and Algorithms (DSA) revision, primarily in Java and C. Each file implements a specific algorithm or array operation, with minimal dependencies and no complex build system.

## File Structure and Patterns
- **Java files**: Each algorithm is implemented in its own `.java` file, with a single public class and a `main` method. Example: `orwitwise.java`, `linearSearch.java`, `pascalTriangle.java`.
- **C files**: Standalone C programs (e.g., `main.c`) use standard library headers and simple main functions.
- **Class files**: Compiled Java bytecode (`.class`) is present for each `.java` source file.

## Developer Workflows
- **Java**: Compile with `javac <filename>.java`, run with `java <classname>`.
- **C**: Compile with `gcc main.c -o main.exe`, run with `main.exe`.
- No test framework or build automation is present; manual compilation and execution is standard.

## Coding Conventions
- Each file is self-contained; no cross-file imports or shared utilities.
- Variable naming is descriptive but concise (e.g., `arr`, `ans`, `set`).
- Algorithms are implemented using basic loops and standard library classes (e.g., `HashSet` for uniqueness in Java).
- Bitwise operations are used for algorithmic demonstration (see `orwitwise.java`, `main.c`).
- Output is printed directly to the console for inspection.

## Examples
- **Bitwise OR of subarrays (Java):**
  ```java
  for (int i = 0; i < arr.length; i++) {
    for (int j = i; j < arr.length; j++) {
      int ans = arr[i];
      for (int k = i + 1; k <= j; k++) {
        ans |= arr[k];
      }
      System.out.println(ans);
    }
  }
  ```
- **Bitwise operations on strings (C):**
  ```c
  for(int i = 0; str[i] != '\0'; i++) {
    str1[i] = str[i] & 127;
    printf("%c", str1[i]);
  }
  ```

## Integration Points
- No external libraries or frameworks are used.
- No configuration files or environment setup required.

## Key Directories/Files
- All source files are in the root directory; no submodules or nested folders.
- `.github/copilot-instructions.md` (this file): Guidance for AI agents.

## AI Agent Guidance
- Focus on single-file algorithms and direct console output.
- When adding new algorithms, follow the pattern of one file per algorithm.
- Use simple, readable code and avoid unnecessary abstraction.
- Reference existing files for examples of array manipulation and bitwise operations.

---
If any section is unclear or missing important details, please provide feedback for improvement.
