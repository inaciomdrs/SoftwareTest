package br.ufrn.imd.funcional.sequence;

public interface ISequence<T> {
	
	/**
	 * Returns a view of the portion of this sequence between the specified fromIndex, inclusive, and toIndex, exclusive.
	 * 
	 * @param fromIndex
	 * @param toIndex
	 * @return
	 */
	ISequence<T> subSequence(int fromIndex, int toIndex);
	
	/**
	 * Returns the element that follows the element passed as parameter in this sequence.
	 * 
	 * @param t
	 */
	T getNext(T t);
	
	/**
	 * Returns the element that precedes the element passed as parameter in this sequence.
	 * 
	 * @param t
	 */
	T getPrevious(T t);
	
	/**
	 * Returns the index of the element in this sequence.
	 * 
	 * @param t
	 * @return
	 */
	int indexOf(T t);
	
	/**
	 * Adds the element to this sequence.
	 * @param t
	 */
	void add(T t);
	
	/**
	 * Removes this element from this sequence.
	 * @param t
	 */
	void remove(T t);
	
	/**
	 * Returns the size of this sequence.
	 * @return
	 */
	int size();
}
