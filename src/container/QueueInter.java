package container;

public interface QueueInter {
    public void AddQ(int elem);
    public void DeleteQ();
    public boolean qIsEmpty();
    public boolean qIsFull();
}
