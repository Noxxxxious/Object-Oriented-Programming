#include "Book.h"
#include <iostream>
#include <string>
Book::Book() {
    author = "empty ";
    title = "empty ";
}
Book::Book(const std::string& author, const std::string& title)
    : author(author), title(title)
{}
Book::Book(std::string&& author, std::string&& title)
    : author(author), title(title)
{}
Book::Book(const Book& other) {
    author = other.author;
    title = other.title;
}
Book::Book(Book&& other) {
    author = other.author;
    title = other.title;
    other.author = "empty ";
    other.title = "empty ";
}
std::string Book::GetAuthor() const {
    return author;
}
std::string Book::GetTitle() const {
    return title;
}
void Book::SetAuthor(const std::string& author) {
    this->author = author;
}
void Book::SetAuthor(std::string&& author) {
    this->author = std::move(author);
}
void Book::SetTitle(const std::string& title) {
    this->title = title;
}
void Book::SetTitle(std::string&& title) {
    this->title = std::move(title);
}
std::ostream& operator<<(std::ostream& os, const Book& book) {
    os << "Author: " << book.author << " Title: " << book.title << std::endl;
    return os;
}
Book& Book::operator=(const Book& right) {
    Book tmp = right;
    std::swap(author, tmp.author);
    std::swap(title, tmp.title);
    return *this;
}
Book& Book::operator=(Book&& right) {
    std::swap(author, right.author);
    std::swap(title, right.title);
    return *this;
}