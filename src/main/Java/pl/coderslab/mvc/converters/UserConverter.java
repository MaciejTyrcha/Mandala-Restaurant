package pl.coderslab.mvc.converters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.coderslab.domain.entities.User;
import pl.coderslab.domain.repositories.UserRepository;

@Component
public class UserConverter implements Converter<String, User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User convert(String id) {
        return userRepository.findOne(Long.parseLong(id));
    }
}