package oop.abstractClass;

public class MyLinkedList implements NodeList{

  private ListItem root = null;

  public MyLinkedList(ListItem root) {
    this.root = root;
  }

  @Override
  public ListItem getRoot() {
    return this.root;
  }

  @Override
  public boolean addItem(ListItem newItem) {
    if (this.root == null) {
      this.root = newItem;
      return true;
    }

    ListItem currentItem = this.root;
    while (currentItem != null) {
      int comparison = currentItem.compareTo(newItem);
      if (comparison < 0) {
//        new item is greater, move right
        if (currentItem.next() != null) {
          currentItem = currentItem.next();
        } else {
//          no next, insert at the end of the list
          currentItem.setNext(newItem).setPrevious(currentItem);
          return true;
        }
      } else if (comparison > 0) {
//        insert before
        if (currentItem.previous() != null) {
          currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
          newItem.setNext(currentItem).setPrevious(newItem);
        } else {
//        the node with a previous is a root
          newItem.setNext(this.root).setPrevious(newItem);
          this.root = newItem;
        }
        return true;
      } else {
//        equal
        System.out.println(newItem.getValue() + " already in a list");
        return false;
      }
    }
    return false;
  }

  @Override
  public boolean removeItem(ListItem listItem) {
    if (listItem != null) {
      System.out.println("Deleting item " + listItem.getValue());

      ListItem currentItem = this.root;
      while (currentItem != null) {
        int comparison = currentItem.compareTo(listItem);
        if (comparison == 0 ) {
//          found the item to delete
          if(currentItem == this.root) {
            this.root = currentItem.next();
          } else {
            currentItem.previous().setNext(currentItem.next());
            if (currentItem.next() != null) {
              currentItem.next().setPrevious(currentItem.previous());
            }
          }
          return true;
        } else if (comparison < 0) {
          currentItem = currentItem.next();
        } else {
//          we are at an item greater than the one to be deleted
//          so the item is not in the list
          return false;
        }
      }
    }
    return false;
  }

  @Override
  public void traverse(ListItem root) {
    if (root == null) {
      System.out.println("The list is empty.");
    } else {
      while (root != null) {
        System.out.println(root.getValue());
        root = root.next();
      }
    }
  }
}
