#include <iostream>
#include <string>
#include "Book.h"
#include "Library.h"
using namespace std;
int main() {
    std::string a = "Michio Kaku", t = "Physics of the Future";
    Book e;
    std::cout << "e: " << e << std::endl;
    Book b1 = { a, t };
    std::cout << "b1: " << b1 << std::endl;
    Book b2 = { "Richard Dawkins","Selfish Gene" };
    std::cout << "b2: " << b2 << std::endl;
    Book b3 = b1;
    std::cout << "b3: " << b3 << " b1: " << b1 << std::endl;
    e = std::move(b2);
    std::cout << "e: " << e << " b2:" << b2 << std::endl;
    e.SetAuthor("William Shakespeare");
    std::cout << "e: " << e << std::endl;
    e.SetTitle("Hamlet");
    std::cout << "e: " << e << std::endl;
    std::cout << endl;


    Library lib;
    cout << "lib: " << lib << endl;
    Library l1 = { {"Michio Kaku", "Parallel Worlds"},
    {"Lawrence Krauss", "A Universe from Nothing"},
    {"Stephen Hawking", "A Brief History of Time"}, 
    {"Carl Sagan","Cosmos: A Personal Voyage"} };
    cout << "l1: " << l1 << endl;
    Library l2(2);
    cout << "l2: " << l2 << endl;
    l2[0] = { "Yuval Noah Harari", "Sapiens: A Brief History of Humankind" };
    l2[1] = { "Neil deGrasse Tyson", "Death by Black Hole" };
    cout << "l2: " << l2 << endl;
    lib = std::move(l2);
    cout << "lib: " << lib << " l2: " << l2 << endl;
    l1[0] = std::move(lib[1]);
    cout << "l1: " << l1 << " lib: " << lib << endl;
}