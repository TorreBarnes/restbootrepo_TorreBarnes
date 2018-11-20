package org.morehouse.restapp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.validation.constraints.AssertFalse;

import org.junit.Test;
import org.morehouse.restapp.resources.Todo;
import org.morehouse.restapp.resources.TodosResource;

public class UpdateToDoTest {
	
	@Test
	public void testChangeAssignee() {
		// setup - create instance of todos resource
		TodosResource resource = new TodosResource();
		Todo existing = new Todo();
		existing.setAssignee("someone");
		Todo update = new Todo();
		update.setAssignee("someone else");
		// execute
		boolean isValid = resource.validateUpdate(existing, update);
		
		// validate
		assertTrue(isValid);
	}
//testChangeAssignee
	
//testSetAssignee starts null exists not null
//testRemoveAssignee
	@Test
	public void testRemoveAssignee() {
		Todo existing = new Todo();
		existing.setAssignee("someone");
		Todo update = new Todo();
		update.setAssignee(null);
	//setup
	// execute
	boolean isValid = TodosResource.validateUpdate(existing, update);
			
	// validate
	assertFalse(isValid);
	}
//testLeaveAssigneeBlank starts null leave null
}
