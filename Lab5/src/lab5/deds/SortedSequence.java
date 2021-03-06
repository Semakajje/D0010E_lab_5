package lab5.deds;

import java.util.ArrayList;

public class SortedSequence {
	private ArrayList<Event> tempQueue;

	public SortedSequence(ArrayList<Event> tempQueue) {
		this.tempQueue = tempQueue;
	}
	
	
	public ArrayList<Event> getSortedQueue() {
		return tempQueue;
	}
	
	
	
	/**
	 * 
	 * Sort the unsorted list.
	 * 
	 */
	public void sort() {
		for (int i = 1; i < tempQueue.size(); i++) {
			Event now = tempQueue.get(i);
			int j = i - 1;

			while (j >= 0 && now.getTime() < tempQueue.get(j).getTime()) {
				tempQueue.set(j + 1, tempQueue.get(j));
				j--;
			}

			tempQueue.set(j + 1, now);
		}

	}

}
