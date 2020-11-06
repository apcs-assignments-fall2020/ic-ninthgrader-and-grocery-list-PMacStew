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
            if (this.list[i] != null && this.list[i].equals(remove)) {
                this.list[i] = null;
                for (int j = i; j < this.list.length - 1; j++) {
                    if (this.list[j] == null && this.list[j + 1] != null) {
                        this.list[j] = this.list[j + 1];
                        this.list[j + 1] = null;
                    }
                }
            }
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