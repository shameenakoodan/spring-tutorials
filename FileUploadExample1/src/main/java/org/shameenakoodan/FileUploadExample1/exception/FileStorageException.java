package org.shameenakoodan.FileUploadExample1.exception;
public class FileStorageException extends RuntimeException{
    private String msg;
    public FileStorageException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

