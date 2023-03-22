import java.nio.file.Paths;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;

public class CassandraConnector {
	public static final String KEY_SPACE = "new_keyspace";

	public static void main(String[] args) {
		System.out.println("Hello");
		try (CqlSession session = CqlSession.builder()
				.withCloudSecureConnectBundle(
						Paths.get("C:\\Users\\mdsou\\Downloads\\secure-connect-test-keyspace.zip"))
				.withAuthCredentials("gaEmngZgIWarlwmwdAqkqUhm",
						"aNKP66S+MdAZJRqEwWNS-wNs_koJBTDg7kLJza+iGzGA3pNpHU1fatzSO6TXqshbai,EXhZWX.zEFxK7T,63OXE,5UI1Ar2iZERL_7Z_,p3+xrReMWLXbrOzZvxSqaZX")
				.withKeyspace(KEY_SPACE).build()) {
			
			ResultSet rs;

//			// CREATE
//			String createTableQuery = "CREATE TABLE book(Id varint, Name text, Author text, ISBN varint, PRIMARY KEY (Id));";
//			rs = session.execute(createTableQuery);
//			System.out.println("Has query executed: "+rs.wasApplied());

//			// INSERT
//			rs = session.execute("INSERT INTO book (Id, Name, Author, ISBN) VALUES (1, 'Will Save the Galaxy for Food','Yahtzee Croshaw', 9781506701653);");
//			System.out.println("Has query executed: "+rs.wasApplied());
//			
//			rs = session.execute("INSERT INTO book (Id, Name, Author, ISBN) VALUES (2, 'Mogworld','Yahtzee Croshaw', 9781506706429);");
//			System.out.println("Has query executed: "+rs.wasApplied());
//			
//			rs = session.execute("INSERT INTO book (Id, Name, Author, ISBN) VALUES (3, 'Jam','Yahtzee Croshaw', 9781506706344);");
//			System.out.println("Has query executed: "+rs.wasApplied());
//			
//			rs = session.execute("INSERT INTO book (Id, Name, Author, ISBN) VALUES (4, 'Differently Morphous','Yahtzee Croshaw', 9781506711645);");
//			System.out.println("Has query executed: "+rs.wasApplied());
//			
//			rs = session.execute("INSERT INTO book (Id, Name, Author, ISBN) VALUES (5, 'ID To Update', 'Update', 9781506733593);");
//			System.out.println("Has query executed: "+rs.wasApplied());
//			
//			rs = session.execute("INSERT INTO book (Id, Name, Author, ISBN) VALUES (6, 'ID To Delete', 'Delete', 0735211294);");
//			System.out.println("Has query executed: "+rs.wasApplied());

			// UPDATE
//			rs = session.execute("UPDATE book SET Name='Will Destroy the Galaxy for Cash',Author='Yahtzee Croshaw',ISBN=0735211295 WHERE Id=5;");
//			System.out.println("Has query executed: "+rs.wasApplied());

//			// DELETE
//			rs = session.execute("DELETE FROM book WHERE Id=6;");
//			System.out.println("Has query executed: " + rs.wasApplied());

//			// Delete table
//			rs = session.execute("DROP Table book");
//			System.out.println("Has query executed: "+rs.wasApplied());

//			// Select the release_version from the system.local table:
//			ResultSet rs = session.execute("select release_version from system.local");
////	           	ResultSet rs = session.execute("Create Table if not exists");
//			Row row = rs.one();
//			// Print the results of the CQL query to the console:
//			if (row != null) {
//				System.out.println(row.getString("release_version"));
//			} else {
//				System.out.println("An error occurred.");
//			}
		}
		System.exit(0);

	}
}
