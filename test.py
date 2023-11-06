def string_equality_check_noncompliant(string1, string2):
    # Noncompliant: 'is' checks identity, not content equality
    if string1 is string2:
        print("The strings are equal.")

def main():
    string_equality_check_noncompliant("bisd", "bisd")

if __name__ == "__main__":
    main()
