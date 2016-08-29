package com.kaltura.client;

/**
 * Created by tehilarozin on 24/08/2016.
 */
public class KalturaLoggerOut implements IKalturaLogger {
    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public void trace(Object message) {
        systemOutMsg("trace: ", message);
    }

    @Override
    public void debug(Object message) {
        systemOutMsg("debug: ", message);
    }

    @Override
    public void info(Object message) {
        systemOutMsg(">> info: ", message);
    }

    @Override
    public void warn(Object message) {
        systemOutMsg("# warn: ", message);
    }

    @Override
    public void error(Object message) {
        systemOutMsg("** error: ", message);
    }

    @Override
    public void fatal(Object message) {
        systemOutMsg("!! fatal: ", message);
    }

    @Override
    public void trace(Object message, Throwable t) {
        systemOutMsg("traceThrowable: ", message + "\n "+t);
    }

    @Override
    public void debug(Object message, Throwable t) {
        systemOutMsg("debugThrowable: ", message + "\n "+t);
    }

    @Override
    public void info(Object message, Throwable t) {
        systemOutMsg(">> infoThrowable: ", message + "\n "+t);
    }

    @Override
    public void warn(Object message, Throwable t) {
        systemOutMsg("# warnThrowable: ", message + "\n "+t);
    }

    @Override
    public void error(Object message, Throwable t) {
        systemOutMsg("** errorThrowable: ", message + "\n "+t);
    }

    @Override
    public void fatal(Object message, Throwable t) {
        systemOutMsg("!! fatalThrowable: ", message + "\n "+t);
    }


    private void systemOutMsg(String prefix, Object message) {
        System.out.println(prefix + message+"\n");
    }

    public static IKalturaLogger getLogger(String name) {
        return new KalturaLoggerOut();
    }
}
