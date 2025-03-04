package jpacrud.dao;

import java.util.List;

import com.maven.maventest.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jpacrud.entities.Book;

public class BookDaoImpl implements BookDao {

	private EntityManager entityManager;

	public BookDaoImpl() {
		entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	}

	
	@Override
	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
	}

	
	@Override
	public List<Book> getBookByTitle(String title) {
		String qStr = "SELECT book FROM Book book WHERE book.title LIKE :ptitle";   //JPQL
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("ptitle", "%"+title+"%");
		return query.getResultList();
	}


	@Override
	public Long getBookCount() {
		String qStr = "SELECT COUNT(book.id) FROM Book book";   //JPQL
		TypedQuery<Long> query = entityManager.createQuery(qStr,
				Long.class);
		Long count = query.getSingleResult();
		return count;
	}

	
	@Override
	public List<Book> getAuthorBooks(String author) {
		String qStr = "SELECT book FROM Book book WHERE book.author=:pAuthor";   //JPQL
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("pAuthor", author);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	
	@Override
	public List<Book> getAllBooks() {
		Query query = entityManager.createNamedQuery("getAllBooks");   //NamedQuery
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	@Override
	public List<Book> getAllBooksNative() {
		 // Native SQL Query
    String sql = "SELECT * FROM books where price<:price";
    Query nativeQuery = entityManager.createNativeQuery(sql, Book.class);
    nativeQuery.setParameter("price", 100);
    List<Book> books = nativeQuery.getResultList();
    return books;
	}
	
	@Override
	public List<Book> getBooksInPriceRange(double low,double high) {
		String qStr = "SELECT book FROM Book book WHERE book.price between :low and :high";  //JPQL
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

}
