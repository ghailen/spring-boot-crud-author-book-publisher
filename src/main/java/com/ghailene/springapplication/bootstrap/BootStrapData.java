package com.ghailene.springapplication.bootstrap;

import com.ghailene.springapplication.model.Author;
import com.ghailene.springapplication.model.Book;
import com.ghailene.springapplication.model.Publisher;
import com.ghailene.springapplication.repositories.AuthorRepository;
import com.ghailene.springapplication.repositories.BookRepository;
import com.ghailene.springapplication.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
private final PublisherRepository publisherRepository;
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("gh publisher");
        publisher.setCity("Hammamet");
        publisher.setState("TN");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count "+ publisherRepository.count());

        Author eric = new Author("Eric","Evans");
        Book javaBook = new Book("Eric book","123456");
        eric.getBooks().add(javaBook);
        javaBook.getAuthors().add(eric);
        javaBook.setPublisher(publisher);
        publisher.getBooks().add(javaBook);

        authorRepository.save(eric);
        bookRepository.save(javaBook);
        publisherRepository.save(publisher);


        Author ghailene = new Author("ghailene","mark");
        Book jeeBook = new Book("ghailene book","123456");
        eric.getBooks().add(jeeBook);
        jeeBook.getAuthors().add(ghailene);
        jeeBook.setPublisher(publisher);
        publisher.getBooks().add(jeeBook);
        authorRepository.save(ghailene);
        bookRepository.save(jeeBook);
        publisherRepository.save(publisher);

        System.out.println("Number of Books : "+ bookRepository.count());
        System.out.println("Publisher Number of Books : "+ publisher.getBooks().size());
    }
}
