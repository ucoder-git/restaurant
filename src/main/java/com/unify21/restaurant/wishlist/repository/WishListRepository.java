package com.unify21.restaurant.wishlist.repository;

import com.unify21.restaurant.db.MemoryDbRepositoryAbstract;
import com.unify21.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
