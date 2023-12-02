
// Connect to the specified database
var db = connect("mongodb://user:password@localhost:27017");

// db.createUser(
//     {
//         user: "user",
//         pwd: "password",
//         roles: [
//             {
//                 role: "readWrite",
//                 db: "review"
//             }
//         ]
//     }
// );

// Insert some sample data into a collection
db.review.insertMany([
    { review_id: 1, customer_id: 12, menu_item_id: 1, rating: 5, comment: "Perfect"},
    { review_id: 2, customer_id: 3, menu_item_id: 14, rating: 1, comment: "Ver bad"},
    { review_id: 3, customer_id: 5, menu_item_id: 21, rating: 3, comment: "It can be better"},
    { review_id: 4, customer_id: 12, menu_item_id: 11, rating: 4, comment: "Okay"}
]);

print("Initialization script executed successfully");
