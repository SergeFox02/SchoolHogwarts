package ru.hogwarts.school.service;

import org.springframework.web.multipart.MultipartFile;
import ru.hogwarts.school.model.Avatar;

import java.io.IOException;
import java.util.Collection;

public interface AvatarService {

    void upLoad(Long id, MultipartFile file) throws IOException;

    Avatar findAvatar(Long avatarId);

    Collection<Avatar> getAllAvatars(Integer pageNumber, Integer pageSize);

}
