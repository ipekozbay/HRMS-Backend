package kodlama.io.Hrms.core.utilities.results;

public class ErrorResult extends Result {

	public ErrorResult() {
		super(false);
	}

	public ErrorResult(String message) {
		super(true, message);

	}

}
