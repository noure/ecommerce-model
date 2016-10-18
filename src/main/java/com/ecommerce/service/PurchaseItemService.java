package com.ecommerce.service;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.dao.PurchaseItemDao;
import com.ecommerce.model.PurchaseItem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PurchaseItemService {

	@Autowired
	private PurchaseItemDao purchaseItemDao;
	
	public long countAllPurchaseItems() {
        return purchaseItemDao.countPurchaseItems();
    }

	public void deletePurchaseItem(PurchaseItem purchaseItem) {
		purchaseItemDao.remove(purchaseItem);
    }

	public PurchaseItem findPurchaseItem(Long id) {
        return purchaseItemDao.findPurchaseItem(id);
    }

	public List<PurchaseItem> findAllPurchaseItems() {
        return purchaseItemDao.findAllPurchaseItems();
    }

	public List<PurchaseItem> findPurchaseItemEntries(int firstResult, int maxResults) {
        return purchaseItemDao.findPurchaseItemEntries(firstResult, maxResults);
    }

	public void savePurchaseItem(PurchaseItem purchaseItem) {
		purchaseItemDao.persist(purchaseItem);
    }

	public PurchaseItem updatePurchaseItem(PurchaseItem purchaseItem) {
        return purchaseItemDao.merge(purchaseItem);
    }
}
