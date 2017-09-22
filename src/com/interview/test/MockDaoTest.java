package com.interview.test;

public class MockDaoTest {

/*In my opinion, you should avoid Mocks as much as you can. 
The reasons why to avoid Mocks are:
you have to make sure that your mocks are compliant with the contract defined by the interface of the DAOs you mock.
reading mock-tests is much more difficult than reading simple unit tests using real implementations. 
Hence it is much more likely your test may contain errors by itself or has logical flows. 
A good test is one which is simple to understand and to verify it is (likely to be) correct. */
/*		private PersonService service;
		private PersonDao dao; //we will be mocking this class

		@Before
		public void setup() {
		dao = mock(PersonDao.class); //here is the actual mocking call

		service = new PersonService();
		service.setPersonDao(dao);   */
		

}
