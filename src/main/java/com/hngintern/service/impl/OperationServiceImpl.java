package com.hngintern.service.impl;

import com.hngintern.enums.OperationType;
import com.hngintern.exception.NoSuchOperationException;
import com.hngintern.model.Request;
import com.hngintern.model.Response;
import com.hngintern.service.OperationService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OperationServiceImpl implements OperationService {


    @Override
    public Response operation(Request request) {

        List<String> arr  = Arrays.asList("minus", "add", "multiply", "sum");
        Response response;
        if (request.getOperation_type().equalsIgnoreCase(OperationType.ADDITION.value()) || request.getOperation_type().toLowerCase().contains(arr.get(1))
        || request.getOperation_type().toLowerCase().contains(arr.get(3))) {
             response = Response.builder()
                    .slackUsername("Deenn")
                    .result(request.getX() + request.getY())
                    .operation_type(OperationType.ADDITION.value().toLowerCase())
                    .build();
        } else if (request.getOperation_type().equalsIgnoreCase(OperationType.SUBTRACTION.value())|| request.getOperation_type().toLowerCase().contains(arr.get(0)))  {
            response = Response.builder()
                    .slackUsername("Deenn")
                    .result(request.getX() - request.getY())
                    .operation_type(OperationType.SUBTRACTION.value().toLowerCase())
                    .build();

        } else if (request.getOperation_type().equalsIgnoreCase(OperationType.MULTIPLICATION.value())|| request.getOperation_type().toLowerCase().contains(arr.get(2)))  {
            response = Response.builder()
                    .slackUsername("Deenn")
                    .result(request.getX() * request.getY())
                    .operation_type(OperationType.MULTIPLICATION.value().toLowerCase())
                    .build();

        } else {
            throw new NoSuchOperationException("NO SUCH OPERATION, KINDLY PUT IN THE RIGHT OPERATION TYPE");
        }
        return response;
    }
}
