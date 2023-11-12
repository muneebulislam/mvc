package com.example.mvc;

import java.util.List;

public interface Subscriber {
    void modelChange(List<Box> boxes);

    void modelChanged(List<Box> boxes);
}
