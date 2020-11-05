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
            if (this.list[i].equals(remove))
                this.list[i] = null;
        }
        for (int i = 0; i < this.list.length - 1; i++) {
            if (this.list[i].equals(null) && !this.list[i + 1].equals(null)) {
                this.list[i] = this.list[i + 1];
                this.list[i + 1] = null;
            }
            if (this.list[i] == null & this.list[i + 1] == null) 
                break;
        }
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == null) 
                break;
            str += this.list[i] + ", ";
        }
        return str;
    }
}