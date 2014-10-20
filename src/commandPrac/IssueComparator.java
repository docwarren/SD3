package commandPrac;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class IssueComparator implements Comparator<Issue> {

	public int compare(Issue a, Issue b) {
		// TODO Auto-generated method stub
		if(b.getPriority() > a.getPriority()) return -1;
		else if(b.getPriority() < a.getPriority()) return 1;
		return 0;
	}

	public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T, U> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0, Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingDouble(
			ToDoubleFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsFirst(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsLast(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Issue> reversed() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Issue> thenComparing(Comparator<? super Issue> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U extends Comparable<? super U>> Comparator<Issue> thenComparing(
			Function<? super Issue, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U> Comparator<Issue> thenComparing(
			Function<? super Issue, ? extends U> arg0,
			Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Issue> thenComparingDouble(
			ToDoubleFunction<? super Issue> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Issue> thenComparingInt(ToIntFunction<? super Issue> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Issue> thenComparingLong(
			ToLongFunction<? super Issue> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
