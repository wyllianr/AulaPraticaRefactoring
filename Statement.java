public abstract class Statement {

    public String generateStatement(Customer customer) {
        String result = header(customer);
        result += body(customer);
        result += footer(customer);
        return result;
    }

    protected abstract String header(Customer customer);
    protected abstract String body(Customer customer);
    protected abstract String footer(Customer customer);
}
