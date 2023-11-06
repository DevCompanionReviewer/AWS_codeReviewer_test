def string_equality_check_noncompliant(string1, string2):
    # Noncompliant: 'is' checks identity, not content equality
    if string1 is string2:
        print("The strings are equal.")

def create_db_connection_noncompliant():
    # Noncompliant: password is hardcoded.
    connection = psycopg2.connect(
        database="mydb",
        user="myuser",
        password="mypassword",
        host="localhost",
        port="5432"
    )
    connection.close()

def main():
    string_equality_check_noncompliant("bisd", "bisd")

if __name__ == "__main__":
    main()
