# Web App Book Quotes

This is a web application that allows users to explore and share book quotes. It is built using Java Enterprise Edition (JEE) and JavaScript.

## Design Patterns Used

The following design patterns have been implemented in this project:

- Observer: Used to manage event notifications and updates within the application.
- Flyweight: Employed to optimize memory usage by sharing common book data among multiple quotes.
- Proxy: Implemented to provide controlled access to book data and perform additional operations.
- DAO (Data Access Object): Used to interact with the underlying data storage and perform CRUD (Create, Read, Update, Delete) operations.
- Singleton: Implemented to ensure a single instance of certain classes that need to be globally accessible.

## Features

The web application includes the following features:

1. Users can add quotes, specifying the author, book name, and type.
2. Users have a private space where they can view the quotes they have liked and added.
3.- Integration with the Google Books API to retrieve book cover images for each book.
4. Users can like quotes related to a specific book and receive notifications for updates and new quotes added by other users.
5. Users can add friends based on their names or emails and visit their profiles.
6. Online chat using WebSockets for real-time communication between users.
7. A dedicated space for the most popular people based on the number of quotes they have published and likes they have gotten.
8. When a user visits a profile, they can see the quotes published by that user, the user's friends, and the quotes they have liked.
9. Users have a profile section where they can modify their information and add a profile picture.

## Getting Started

To get a local copy of this project up and running, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/web-app-book-quotes.git`
2. Navigate to the project directory: `cd web-app-book-quotes`
3. Add the database : [u can export the quote.sql file in your sgbd ( i used phpMyAdmin) ]
4. Build and run the application: 

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/your-feature`
3. Make your changes and commit them: `git commit -m 'Add your feature'`
4. Push the changes to your forked repository: `git push origin feature/your-feature`
5. Submit a pull request detailing your changes.

## License

Created and designed by Mohamed Fatehi Alhabib.

## Contact

If you have any questions or suggestions, feel free to reach out to the project maintainers:

- [Mohamed Fatehi Alhabib](mohamedalhabib.fatehi@etu.uae.ac.ma)



