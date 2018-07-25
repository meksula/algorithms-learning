package chapter6;

import java.util.ArrayList;
import java.util.List;

public class Bucket<T> {
	public char label;
	public int labelInt;
	public List<T> bucketPieces;
	
	Bucket(char label) {
		this.label = label;
		this.bucketPieces = new ArrayList<>();
	}
	
	Bucket(int labelInt) {
		this.labelInt = labelInt;
		this.bucketPieces = new ArrayList<>();
	}
	
	public void toss(T element) {
		this.bucketPieces.add(element);
	}
	
	public List<T> getBucket() {
		return bucketPieces;
	}
}
