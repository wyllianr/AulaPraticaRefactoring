public class HtmlStatement extends Statement {

    @Override
    protected String header(Customer aCustomer) {
        return "<H1> \r\n" + //
                        "Aluguéis para <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String eachRentalDetails(Rental each) {
        return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }

    @Override
    protected String footer(Customer aCustomer) {
        return "<P> Você deve <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
               "Neste aluguel você ganhou <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> pontos de locatário frequente <P>";
    }
}
