package poc.junit.calculator;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionTest {
	
	
	@Test
	void checkSystemProperties() {
		Properties properties = System.getProperties();
		properties.forEach((key, value) -> System.out.println(key + " : " + value));
	}

	@Test
	@EnabledOnOs({OS.WINDOWS})
	void testRunOnlyOnWindows() {
		
	}
	
	@Test
	@DisabledOnOs({OS.WINDOWS})
	void testDisabledOnWindows() {
		
	}
	
	
	@Test
	@EnabledOnJre(value = {JRE.JAVA_19})
	void testEnabledOnJava19() {
		
	}
	
	@Test
	@DisabledOnJre(value = {JRE.JAVA_19})
	void testDisabledOnJava19() {
		
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_14, max = JRE.JAVA_20)
	void testEnabledForJRERange() {
		
	}
	
	@Test
	@DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_13)
	void testDisabledForJRERange() {
		
	}
	
	@Test
	@EnabledIfSystemProperties({
		@EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation"),
		@EnabledIfSystemProperty(named = "java.version", matches = "19")
	})
	void testEnabledOnJavaVendorOracle() {
		
	}
	
	@Test
	@DisabledIfSystemProperties({
		@DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation"),
		@DisabledIfSystemProperty(named = "java.version", matches = "19")
	})
	void testDisabledOnJavaVendorOracle() {
		
	}
	
	@Test
	@EnabledIfEnvironmentVariables({
		@EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
	})
	void testEnabledOnProfileDev() {
		
	}
	
	@Test
	@DisabledIfEnvironmentVariables({
		@DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
	})
	void testDisabledOnProfileDev() {
		
	}
}
