package com.testingday1Task;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest {
	VoterValidator v=new VoterValidator();
	@Test
	void testValidateVoterAge()throws Exception {
		Exception e=assertThrows(Exception.class,()->{v.validateVoterAge(-4);});
		Assertions.assertEquals("Invalid Age",e.getMessage());
		
	}
		
		@ParameterizedTest
		@ValueSource(ints = { 19,20,45,78})
		public void validateVoterAgeTestParameter123(int age) throws Exception {
			
			Assertions.assertTrue(v.validateVoterAge(age));
		}
}


