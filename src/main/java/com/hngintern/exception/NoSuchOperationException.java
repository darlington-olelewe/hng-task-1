package com.hngintern.exception;

public class NoSuchOperationException extends RuntimeException  {



        private String message;

        public NoSuchOperationException() {}

        public NoSuchOperationException(String msg)
        {
            super(msg);
            this.message = msg;
        }
}

