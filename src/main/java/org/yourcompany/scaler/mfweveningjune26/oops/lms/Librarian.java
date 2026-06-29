package org.yourcompany.scaler.mfweveningjune26.oops.lms;

class Librarian extends User {
    private final String employeeNumber; // employeeNumber for librian. Only exist here.

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("--- Librarian Dashboard ---");
        System.out.println("Name: " + getName());
        System.out.println("Employee #: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        // Decision: librarians have unrestricted borrowing access.
        // No borrow count is tracked for them.
        return true;
    }

    public void addNewBook(Book book)  { /* HW: implementation later */ }
    public void removeBook(Book book)  { /* HW: implementation later */ }

    public String getEmployeeNumber() {
        return employeeNumber;
    }
    
}
