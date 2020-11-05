public class GroceryList {
    private String[] list;

    public GroceryList() {
        this.list = new String[100];
    }
    public void add(String add) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == null) {
                this.list[i] = add;
                break;
            }
        }
    }
    public String getListInstance(int index) {
        return this.list[index];
    }
    public String[] getList() {
        return this.list;
    }
    public void remove(String remove) {
        for (int i = 0; i < this.list.length; i++) {
            if (!this.list[i].equals(null))
                System.out.print("");
            else
                break;
            if (this.list[i].equals(remove))
                this.list[i] = "";
        }
        for (int i = 0; i < this.list.length - 1; i++) {
            if (this.list[i].equals("") && !this.list[i + 1].equals("")) {
                this.list[i] = this.list[i + 1];
                this.list[i + 1] = "";
            }
            if (this.list[i] == "" & this.list[i + 1] == "") 
                break;
        }
    }
    public String toString() {
        String str = "Grocery list: ";
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == null) 
                break;
            str += this.list[i] + ", ";
        }
        return str;
    }
}