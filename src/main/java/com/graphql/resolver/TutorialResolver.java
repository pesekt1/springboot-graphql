package com.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.model.Author;
import com.graphql.model.Tutorial;
import com.graphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//FIXME: this resolver is not needed, when Tutorial is queried it uses getAuthor() from Tutorial class.
@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
	@Autowired
	private AuthorRepository authorRepository;

	public TutorialResolver(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

//	public Author getAuthor(Tutorial tutorial) {
//		return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
//	}
}
