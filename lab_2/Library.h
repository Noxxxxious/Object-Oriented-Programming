#pragma once
#include "Book.h"
#include <initializer_list>
class Library {
	Book* array;
	std::size_t size;
public:
	Library();
	Library(std::initializer_list<Book> list);
	Library(const Library& orig);
	Library(Library&& orig);
	Library(std::size_t s);
	Library& operator=(const Library& right);
	Library& operator=(Library&& right);
	Book& operator[](std::size_t index);
	const Book& operator[](std::size_t index) const;
	friend std::ostream& operator<<(std::ostream& os, const Library& library);
	std::size_t GetSize() const;
	~Library();
};
