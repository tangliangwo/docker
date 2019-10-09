package com.example.aigouusercenterservice.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.aigouusercenterservice.dao.TProductMapper;
import com.example.aigouusercenterservice.entity.TProduct;
import com.example.aigouusercenterservice.service.ITProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author clj
 * @since 2019-10-03
 */
@Service
public class TProductServiceImpl extends ServiceImpl<TProductMapper, TProduct> implements ITProductService {

}
