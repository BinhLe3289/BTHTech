package com.vti.bthtech.service;

import com.vti.bthtech.dto.AccessoryDto;
import com.vti.bthtech.form.AccessoryCreateForm;
import com.vti.bthtech.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);
    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(Long id, AccessoryUpdateForm form);

    void deleteById(Long id);
}
