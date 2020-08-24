public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public boolean print(int pages, int copies) {
        int totalPages = pages * copies;
        if (this.sheets >= totalPages) {
            this.sheets -= totalPages;
            return true;
        } else {
            return false;
        }
    }

    public int getToner() {
        return toner;
    }
}
