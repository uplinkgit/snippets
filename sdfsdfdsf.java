// Create the connection and use it to upload the new object using the pre-signed URL.
Path path = Paths.get("c:/1/file.stl");
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setDoOutput(true);
connection.setRequestMethod("PUT");

DataOutputStream out = new DataOutputStream(connection.getOutputStream());
out.write(Files.readAllBytes(path));
out.close();

// Check the HTTP response code. To complete the upload and make the object available, 
// you must interact with the connection object in some way.
connection.getResponseCode();
System.out.println("HTTP response code: " + connection.getResponseCode());