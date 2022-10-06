package poc.junit.calculator;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;


/**
 * Tes menggunakan tag
 * Digunakan untuk menjalankan testing dengan tag tertentu
 * Cara menjalankannya dengan perintah berikut: mvn test -Dgroups=tag1,tag2
 * @author yoeda
 *
 */
@Tags({
	@Tag("integration-test")
})
public class SampleIntegrationTest {

	@Test
	void test1() {
		
	}
	
	@Test
	void test2() {
		
	}
}
