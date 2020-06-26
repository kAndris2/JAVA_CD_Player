package mypackage;

import java.util.List;

public class Menu {
    private List<MenuItem> items;
    private List<Writer> writers;

    public void AddItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public void show() {
        for (int i = 0; i < items.size(); i++) {
            writers.iterator().next().write("Szoszi " + i);
        }
    }

    public void addWriter(Writer writer) {
        writers.add(writer);
    }
}