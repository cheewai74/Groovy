class MainCalculator {
    static void main(String[] args) {
        Calculator cal = new Calculator()
        assert cal.add(5, 5) == 10
        assert cal.subtract(8, 2) == 6
        assert cal.divide(10, 2) == 5
        assert cal.multiply(4, 4) == 16

        try {
            cal.divide(7, 0)
         }
        catch (RuntimeException e){
            assert e.getMessage() == "Cannot divide by zero"
        }
    }
}
