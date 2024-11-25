public abstract class Statement {
    
    public String statement(Customer aCustomer) {
        String result = getHeader(aCustomer);
        
        result += getBody(aCustomer);
        
        result += getFooter(aCustomer);
        
        return result;
    }

    protected abstract String getHeader(Customer aCustomer);
    protected abstract String getBody(Customer aCustomer);
    protected abstract String getFooter(Customer aCustomer);
}
