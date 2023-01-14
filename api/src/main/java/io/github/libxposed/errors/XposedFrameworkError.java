package io.github.libxposed.errors;

/**
 * Thrown to indicate that the Xposed framework function is broken.
 */
public abstract class XposedFrameworkError extends Error {

    public XposedFrameworkError(String message) {
        super(message);
    }

    public XposedFrameworkError(String message, Throwable cause) {
        super(message, cause);
    }

    public XposedFrameworkError(Throwable cause) {
        super(cause);
    }
}