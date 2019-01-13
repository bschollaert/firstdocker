import { TestBed } from '@angular/core/testing';

import { PeopleApiService } from './people-api.service';

describe('PeopleApiService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PeopleApiService = TestBed.get(PeopleApiService);
    expect(service).toBeTruthy();
  });
});
