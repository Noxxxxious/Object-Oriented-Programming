#pragma once
#include <string>
class Book {
    std::string author, title;
public:
    Book();
    Book(const std::string& author, const std::string& title);
    Book(std::string&& author, std::string&& title);
    Book(const Book& other);
    Book(Book&& other);
    std::string GetAuthor() const;
    std::string GetTitle() const;
    void SetAuthor(const std::string& author);
    void SetAuthor(std::string&& author);
    void SetTitle(const std::string& title);
    void SetTitle(std::string&& title);
    friend std::ostream& operator<<(std::ostream& os, const Book& book);
    Book& operator=(const Book& right);
    Book& operator=(Book&& right);
};
