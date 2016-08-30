package br.ufrn.imd.funcional.sequence;

import java.util.LinkedList;
import java.util.List;

public class Sequence<T> implements ISequence<T> {

	private final List<T> list;

	public Sequence() {
		list = new LinkedList<>();
	}

	@Override
	public ISequence<T> subSequence(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getNext(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getPrevious(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(T t) {
		this.list.add(t);
	}

	@Override
	public void remove(T t) {
		this.list.remove(t);
	}

	@Override
	public int size() {
		return this.list.size();
	}
}
