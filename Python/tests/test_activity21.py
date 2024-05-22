import pytest

def test_addition():
    num1 = 10
    num2 = 20
    sum = 10+20
    assert sum==30

def test_subtraction():
    num1 = 20
    num2 = 30
    diff = num2-num1
    assert diff==10

def test_multiplication():
    num1 = 2
    num2 = 5
    mul = num1 * num2
    assert mul==10

def test_quotient():
    num1 = 8
    num2 = 2
    quo = num1/num2
    assert quo==4
