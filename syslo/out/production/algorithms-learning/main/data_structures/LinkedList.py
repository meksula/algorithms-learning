from abc import ABCMeta, abstractmethod

# @Author
# Karol Meksuła
# 13-07-2018


class Box:

    def __init__(self, load=None):
        self.load = load
        self.next = None

    def get_load(self):
        return self.load


class LinkedList:

    def __init__(self):
        self.head = None

    def insert(self, load):
        if self.head is None:
            self.head = Box(load)

        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = Box(load)

    def get(self, index: int):
        current = self.head
        counter = 0

        while current is not None:
            if counter == index:
                return current.load
            else:
                current = current.next
                counter += 1


class Dog:

    def __init__(self, name: str = None, age: int = None):
        self.name = name
        self.age = age

    def __str__(self):
        return self.name


if __name__ == '__main__':
    linked_list = LinkedList()
    linked_list.insert(Dog("Scruffy", 5))
    linked_list.insert(Dog("Betty", 7))
    linked_list.insert(Dog("Kenny", 2))
    linked_list.insert(Dog("Cindy", 2))
    linked_list.insert(Dog("Stefan", 4))

    dog = linked_list.get(0)
    print(dog)

    dog2 = linked_list.get(1)
    print(dog2)

    dog3 = linked_list.get(2)
    print(dog3)

    dog4 = linked_list.get(3)
    print(dog4)

    dog5 = linked_list.get(4)
    print(dog5)
