#include <iostream>
#include <string>
#include <initializer_list>
#include "Library.h"
Library::Library() {
	array = nullptr;
	size = 0;
}
Library::Library(std::initializer_list<Book> initList) 
	: size{initList.size()}, array{new Book[initList.size()]}
{
	std::size_t i = 0;
	for (Book b : initList)
	{
		array[i] = b;
		i++;
	}
}
Library::Library(const Library& orig) {
	array = orig.array;
	size = orig.size;
}
Library::Library(Library&& orig) {
	array = orig.array;
	size = orig.size;
	orig.array = nullptr;
	orig.size = 0;
}
Library::Library(std::size_t s) 
	: size{ s }, array{ new Book[s] }
{}
Library& Library::operator=(const Library& right) {
	Library tmp = right;
	std::swap(array, tmp.array);
	std::swap(size, tmp.size);
	return *this;
}
Library& Library::operator=(Library&& right) {
	std::swap(array, right.array);
	std::swap(size, right.size);
	return *this;
}
Book& Library::operator[](std::size_t index) {
	return array[index];
}
const Book& Library::operator[](std::size_t index) const {
	return array[index];
}
std::ostream& operator<<(std::ostream& os, const Library& library) {
	for (std::size_t i = 0; i < library.GetSize(); i++) {
		os << library[i];
	}
	return os;
}
std::size_t Library::GetSize() const {
	return size;
}
Library::~Library()
{
	if (array != nullptr)
	{
		std::cout << "Releasing memory " << array << std::endl;
		delete[] array;
	}
}
